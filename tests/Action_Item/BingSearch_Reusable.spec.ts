import { test, Page } from '@playwright/test';
import { getText, typeText } from '../Reusable_Action';

let page : Page;
test.beforeAll(async ({ browser }) => {
    page = await browser.newPage()
})


test("Search scoccer in Bing search box @ai", async ({  }) => {

    //navigate to bing
    await page.goto('https://www.bing.com')
    await page.waitForTimeout(3000) //wait for few seconds for the next step
    //type a keyword on the search box
    await typeText(page, '[name="q"]', 'Soccer', "SearchBox")
    
    await page.keyboard.press('Enter')

    
})//end of test 1

test("Capture Search Result for soccer @ai", async ({  }) => {
    const resultLocator = '.sb_count';

    await page.waitForSelector(resultLocator, { state: 'attached' }); 

    let searchResult = await getText(page, resultLocator, "searchResult")
    console.log("Search result: " + searchResult)
    let searchNumber = searchResult.split(" ")
    console.log("Search number is: " + searchNumber[1])

})