import { Page, test } from '@playwright/test';
import { clickBYIndex, clickElement, getText, typeText } from '../Reusable_Action';


let page: Page;
test.beforeAll(async ({ browser }) => {
    page = await browser.newPage()
})

test("Search PlayRight on Bing search box", async ({  }) => {
    //navigate to bing
    await page.goto('https://www.bing.com')
    await page.waitForTimeout(3000) //wait for few seconds for the next step
    //type a keyword on the search box
    await typeText(page, '[name="q"]', 'Playwright', "SearchBox")
    await page.keyboard.press('Enter')

})//end of test 1


test("Capture Search Result", async ({  }) => {
    let searchResult = await getText(page, '[class = "sb_count"]', "searchResult")
    console.log("Search result: " + searchResult)
    let searchNumber = searchResult.split(" ")
    console.log("Search number is: " + searchNumber[1])

})