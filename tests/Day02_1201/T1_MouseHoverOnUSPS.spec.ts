import { Page, test } from '@playwright/test';

test("Mouse hover on USPS website and track a package @smoke", async ({ page }) => {

//navigate to USPS website
await page.goto('https://www.usps.com/')
//hover to the "Quick Tools" menu
await page.locator('[class="nav-first-element menuitem"]').hover()
//click on "Track a Package" option
await page.locator('text=Track a Package').click()
//enter a tracking number
await page.locator('[id="tracking-input"]').fill('11111')
await page.waitForTimeout(5000) //wait for few seconds for the next step


/*
     example of contains using text and non-text

        //click on track button using contain text
        await page.locator('button:has-text("Track")').click();
        //click on track button using contains id
        await page.locator('[id*="track-button"]').click();
    */

}) //end of test