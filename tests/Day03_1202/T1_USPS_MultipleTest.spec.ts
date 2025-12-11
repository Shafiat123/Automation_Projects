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

});

test("Mouse hover on USPS website and Shedule a pickup", async ({ page }) => {

//navigate to USPS website
await page.goto('https://www.usps.com/')
//hover to the "Quick Tools" menu
await page.locator('[class="nav-first-element menuitem"]').hover()
await page.waitForTimeout(2000) //wait for few seconds for the next step
//click on "Shedule a pickup" option
await page.locator('[alt="Schedule a Pickup Icon"]').click()


}); //end of test