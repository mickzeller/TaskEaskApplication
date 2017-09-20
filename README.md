# TaskEasy Development Candidate Test Project

## Goals:

### Translate a csv file into a JSON object using Java and print to standard out.

### Make a request to a Rest API endpoint (hosted locally) and render the results in a web UI table.


## Tools Provided:

* Instructions for starting your local Node.js server
* An example csv file to import [academy_award_actresses.csv](https://bitbucket.org/taskeasy/candidate-test/src/master/academy_award_actresses.csv?fileviewer=file-view-default)
* A format example for how the final JSON should look (and will be the file you download for the Ajax portion) [academy_award_actresses.json](https://bitbucket.org/taskeasy/candidate-test/src/master/academy_award_actresses.json?fileviewer=file-view-default)

## Setup:

1. Fork this repo
2. Setup the local server that you will use for Ajax requests
	1. Navigate to your cloned repo
	2. `npm install -g local-web-server`
	3. run `ws`
	4. Open a browser and navigate to http://127.0.0.1:8000/academy_award_actresses.json to verify the json is being served locally
2. Or, for extra credit, You can set up your own Java web server to serve the JSON.
3. Prepare your Java project.
	1. Part of the fun is setting up your development environment. Enjoy!
4. Once you are satisfied with your work, create a pull request.

## Requirements:

1. From Java, read in a csv file and translate the output to a Java object.
2. Convert that object into to a _valid_ JSON string that can be printed to stdout.
	a. Bonus points for outputs other than standard out (i.e. your own server that serves valid JSON)
	b. Minus points for string concatenation
3. Create the UI in html
4. Make an Ajax request to the provided url above (or your web server) and use the returned data to render an html table of the data.
	* You can use any javascript library you want to perform requests and/or render data. Or, you can go straight vanilla.
	* The table should have alternating row colors.
	* Add a click handler to the table row to show a basic alert
		* Bonus points: show the data for that row in the alert.
		* Bonus points: show something with rich media when clicking on the row
