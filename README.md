# Property Price Evaluator
This web Application calculates the optimal range for a property based on regression models.

## API Call with cURL
curl -X GET --header 'Accept: application/json' --header 'apikey: ATTOM_API_KEY' --header 'accept: application/json' 'https://api.gateway.attomdata.com/propertyapi/v1.0.0/property/address?postalcode=75094&page=1&pagesize=100'