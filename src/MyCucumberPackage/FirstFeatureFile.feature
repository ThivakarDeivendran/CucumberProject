Feature:check My cart application

Scenario:  No item selected in Basket
Given I start the application
Then I should see a selection of products
When  I browse without the buying Product
Then My basket should be empty
And I close the application