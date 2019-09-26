Scenario: create job


Given I'm creating a job
And my name is Eduardo
when I create the job
Then I get the response code 201