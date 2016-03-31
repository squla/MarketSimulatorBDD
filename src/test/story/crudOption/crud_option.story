Meta:

Narrative:
As a user
I want to add and remove option
So that I can have manipulation my options


Scenario: adding new option to empty storage
Given storage containing 0 option
When user add new PUT option with strike 1
Then storage contain 1 options

Scenario: adding option to storage with one option
Given storage containing 1 PUT options with stike 0
When user add new PUT option with strike 1
Then storage contain 2 options

Scenario: removing option from storage with one put option
Given storage containing 1 PUT options with stike 0
When user remove PUT option with strike 0
Then storage contain 0 options