# Nimesa

A modular program in java to allow user to use a REST GET API of weather forecast of London location.

There are total 3 modules in this project.

1. Get_user_input: It gets the user input (opt and datetime) and calls the methods of module Get_data to give the required result.
2. Get_data: It has the required methods (get_temp(), get_windspeed(), get_pressure()) which are called by Get_user_input module. It also calls module Get_api to get the required json object from the REST API.
3. Get_api: It gets the json data from the REST API and converts it into a json object and returns it back to the module Get_data.
