import { test } from '@playwright/test';
import { clickBYIndex, clickElement, hoverElement, scrollByPixel, typeTextByIndex, getText } from '../Reusable_Action';

test('USPS stamp information capture', async ({ page }) => {  
    // Navigate to USPS website
    await page.goto('https://www.usps.com/');

    // Hover Shop menu
    await clickBYIndex(page, '//*[text()="Shop"]',0, 'Shop Menu');
    
    //click on Stamps
    await clickBYIndex(page, '[class="tool-stamps"]', 1, 'Stamps Link');
    
    //click on checkbox for stamps under category section
    await clickBYIndex(page, '//*[text() = "Stamps (106)"]', 0, 'Stamps Checkbox');

    //check on Additional Postage button
    await clickElement(page, '//*[text()= "Additional Postage (25)"]', 'Additional Postage Button');

    //scoll by pixel to 500 pixel
    await scrollByPixel(page, 500);

    //click on first stamp
    await clickBYIndex(page, '//*[@class="col-6 col-md-4 results-per-page "]', 0, 'Clicking on First Stamp');

    //click on add to cart button
    await clickElement(page, '[id="addToCartVisBtn122104"]', 'Add to Cart Button');
    
    //click on view cart button
    await clickElement(page, '//*[text()="View Cart"]', 'View Cart Button');

    //input 2 quantity for the stamp
    await typeTextByIndex(page, '//*[@type="text"]', 7, '2' , 'Quantity Input Box');

    //click on update button
    await clickBYIndex(page, '//*[@type="submit"]', 8, 'Update Button');

    //capturing the item information & print it on the console
    let info = await getText(page, '//*[@class="prod-info-detail"]', 'Item Information');
    console.log("Item information: " + info)


    //have some wait before close
    await page.waitForTimeout(5000);
})//end of test1



