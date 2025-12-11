import { Page, test } from '@playwright/test';

test("Search for a keyword on bing website @smoke", async ({ page }) => {

    //declzre arraylist of Cars
    //let cars: string[] = ['BMW', 'Audi', 'Mercedes', 'Toyota', 'Honda']
    let cars = new Array<string>()
    cars.push('BMW')
    cars.push('Audi')
    cars.push('Mercedes')
    cars.push('Toyota')
    cars.push('Honda')

    //loop through the array list
    for (let i = 0; i < cars.length; i++) {

    //navigate to bing
    await page.goto('https://www.bing.com')
    //type a keyword on the search box
    await page.locator('[name="q"]').fill(cars[i])
    await page.waitForTimeout(2000) //wait for few seconds for the next step
    //click on the search icon
    await page.keyboard.press('Enter')

    //capture search result text
    let searchResult = await page.locator('[class = "sb_count"]').textContent()
    //for concatenation purpose use , or +
    console.log("Search result: " + searchResult)
    //extract number from the search result
    let resultsArray = searchResult?.split(' ')
    console.log("For car: " + cars[i]+ " : " + resultsArray[1]) 

    }//end of for loop
}) //end of test 2
