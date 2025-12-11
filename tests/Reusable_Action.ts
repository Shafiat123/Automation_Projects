import { Page } from '@playwright/test';

//method to click any unique element
export async function clickElement(page: Page, Locator: string, elementName: string) {
    console.log("Clicking on element: " + elementName)
    await page.locator(Locator).click()

}//end of clickElement method

//method to click any element by index
export async function clickBYIndex(page: Page, Locator: string, index: number, elelmentName: string) {
    console.log("Click on elelment:" + elelmentName)
    await page.locator (Locator).nth(index).click()
}//end of clickElement by index method

//method to type something on the unique item
export async function typeText(page: Page, Locator: string, userValue: string, elementName: string) {
    console.log("Typing on element: " + elementName)
    await page.locator(Locator).fill(userValue)
}//end of typeText method

//method to type something on the element by index
export async function typeTextByIndex(page: Page, Locator: string, index: number, userValue: string, elementName: string) {
    console.log("Typing on element: " + elementName)
    await page.locator(Locator).nth(index).fill(userValue)
}//end of typeTextByIndex method

//method to get text from any unique element
export async function getText(page: Page, Locator: string, elementName: string) {
    console.log("Getting text from element: " + elementName)
    let textValue = await page.locator(Locator).textContent()
    return textValue
}//end of getText method


