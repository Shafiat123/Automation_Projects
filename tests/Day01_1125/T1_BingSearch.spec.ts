import { Page, test } from '@playwright/test';

//initalize page varriable for browser
let page: Page
let value: string //just an example
let integer: number //just an example


test.beforeAll(async ({ browser }) => {
    //create a new page instance
    page = await browser.newPage()

})

test("Search for a keyword on bing website", async () => {
    //navigate to bing
    await page.goto('https://www.bing.com')
    //type a keyword on the search box
    await page.locator('[name="q"]').fill('Playwright')
    await page.waitForTimeout(2000) //wait for few seconds for the next step
    //click on the search icon
    await page.keyboard.press('Enter')
})//end of test 1

test("Capture Search", async() =>{
    //capture search result text
    let searchResult = await page.locator('[class = "sb_count"]').textContent()
    //for concatenation purpose use , or +
    console.log("Search result: " + searchResult)
    //extract number from the search result
    let resultsArray = searchResult?.split(' ')
    console.log("Result Array "+ resultsArray[1])  
}) //end of test 2
