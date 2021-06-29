# retrieveNumberId

Obtain information about the id associated with the Twitter username

## Solution Architecture

```mermaid
graph TD
id0((client))
id1[twitter-notification-sys]
id2[TwitterApi]


id0--GET-->/retrieveNumberId
id1-->id2
subgraph mule Service

/retrieveNumberId --> id1
end
```

## GET

### Process Diagram

```mermaid
graph LR
    request --> process
    process --> response
```

### Sequence Diagram

### HTTP Endpoints

| Path                                                         | http Method | Body MIME type |
| ------------------------------------------------------------ | ----------- | -------------- |
| **{protocol}://{host}:{port}**/Twitter-notification-ux/v1/{bussinessId}/user/{id} | GET         | JSON           |


### Headers

Definition of headers for the request.

| name | type | description |
| ---- | ---- | ----------- |
|      |      |             |



### URI Params

Definition of uri parameters for the request.

| name       | type   | description                                                  | required |
| :--------- | ------ | ------------------------------------------------------------ | -------- |
| businessId | String | 2 letter ISO 3166 country code  (TT, BB, JM, PA, etc.) identifying the business unit. <br />Enum values:<br />CO-Colombia<br/>PA-Panama<br/> | Y        |
| id         | String | customer's Userid                                            |          |

### Query Params

Definition of query parameters for the request.

| name | type | description | required |
| ---- | ---- | ----------- | -------- |
|      |      |             |          |


### Body Request

Definition of body request.

```json
{    
}
```

#####  Body   Details

| name | type | description | required |
| ---- | ---- | ----------- | -------- |
|      |      |             |          |



### Response

Definition of all response types.

#### 200

```json
[
    {
        "id": 286847247,
        "id_str": "286847247",
        "name": "kevin",
        "screen_name": "krojas30",
        "location": "panama",
        "description": "sincero, #geek , padre, desarrollador de software, jugador de futbol, panameño 100%, marea roja de corazon",
        "url": "https://t.co/ce5ALo9iEM",
        "entities": {
            "url": {
                "urls": [
                    {
                        "url": "https://t.co/ce5ALo9iEM",
                        "expanded_url": "https://afius.website",
                        "display_url": "afius.website",
                        "indices": [
                            0,
                            23
                        ]
                    }
                ]
            },
            "description": {
                "urls": []
            }
        },
        "protected": false,
        "followers_count": 79,
        "friends_count": 159,
        "listed_count": 2,
        "created_at": "Sat Apr 23 20:29:12 +0000 2011",
        "favourites_count": 91,
        "utc_offset": null,
        "time_zone": null,
        "geo_enabled": false,
        "verified": false,
        "statuses_count": 2451,
        "lang": null,
        "status": {
            "created_at": "Thu Jun 17 16:58:40 +0000 2021",
            "id": 1405570603478835200,
            "id_str": "1405570603478835200",
            "text": "RT @freddier: 💵 Qué es el dinero y de dónde viene su valor \nhttps://t.co/qhvPfmKwGt",
            "truncated": false,
            "entities": {
                "hashtags": [],
                "symbols": [],
                "user_mentions": [
                    {
                        "screen_name": "freddier",
                        "name": "Freddy Vega",
                        "id": 16742912,
                        "id_str": "16742912",
                        "indices": [
                            3,
                            12
                        ]
                    }
                ],
                "urls": [
                    {
                        "url": "https://t.co/qhvPfmKwGt",
                        "expanded_url": "https://youtu.be/fx8rnXZ0iVA",
                        "display_url": "youtu.be/fx8rnXZ0iVA",
                        "indices": [
                            60,
                            83
                        ]
                    }
                ]
            },
            "source": "<a href=\"https://about.twitter.com/products/tweetdeck\" rel=\"nofollow\">TweetDeck</a>",
            "in_reply_to_status_id": null,
            "in_reply_to_status_id_str": null,
            "in_reply_to_user_id": null,
            "in_reply_to_user_id_str": null,
            "in_reply_to_screen_name": null,
            "geo": null,
            "coordinates": null,
            "place": null,
            "contributors": null,
            "retweeted_status": {
                "created_at": "Thu Jun 17 14:46:15 +0000 2021",
                "id": 1405537277787344899,
                "id_str": "1405537277787344899",
                "text": "💵 Qué es el dinero y de dónde viene su valor \nhttps://t.co/qhvPfmKwGt",
                "truncated": false,
                "entities": {
                    "hashtags": [],
                    "symbols": [],
                    "user_mentions": [],
                    "urls": [
                        {
                            "url": "https://t.co/qhvPfmKwGt",
                            "expanded_url": "https://youtu.be/fx8rnXZ0iVA",
                            "display_url": "youtu.be/fx8rnXZ0iVA",
                            "indices": [
                                46,
                                69
                            ]
                        }
                    ]
                },
                "source": "<a href=\"http://tapbots.com/tweetbot\" rel=\"nofollow\">Tweetbot for iΟS</a>",
                "in_reply_to_status_id": null,
                "in_reply_to_status_id_str": null,
                "in_reply_to_user_id": null,
                "in_reply_to_user_id_str": null,
                "in_reply_to_screen_name": null,
                "geo": null,
                "coordinates": null,
                "place": null,
                "contributors": null,
                "is_quote_status": false,
                "retweet_count": 22,
                "favorite_count": 189,
                "favorited": false,
                "retweeted": true,
                "possibly_sensitive": false,
                "lang": "es"
            },
            "is_quote_status": false,
            "retweet_count": 22,
            "favorite_count": 0,
            "favorited": false,
            "retweeted": true,
            "possibly_sensitive": false,
            "lang": "es"
        },
        "contributors_enabled": false,
        "is_translator": false,
        "is_translation_enabled": false,
        "profile_background_color": "C0DEED",
        "profile_background_image_url": "http://abs.twimg.com/images/themes/theme1/bg.png",
        "profile_background_image_url_https": "https://abs.twimg.com/images/themes/theme1/bg.png",
        "profile_background_tile": false,
        "profile_image_url": "http://pbs.twimg.com/profile_images/479384136725962752/38rotXbv_normal.png",
        "profile_image_url_https": "https://pbs.twimg.com/profile_images/479384136725962752/38rotXbv_normal.png",
        "profile_link_color": "1DA1F2",
        "profile_sidebar_border_color": "C0DEED",
        "profile_sidebar_fill_color": "DDEEF6",
        "profile_text_color": "333333",
        "profile_use_background_image": true,
        "has_extended_profile": true,
        "default_profile": true,
        "default_profile_image": false,
        "following": false,
        "follow_request_sent": false,
        "notifications": false,
        "translator_type": "none",
        "withheld_in_countries": []
    }
]
```

#####  Body   Details

| name | type | description | required |
| ---- | ---- | ----------- | -------- |
|      |      |             |          |

#### 401

Unauthorized - The request has not been applied because it lacks valid authentication credentials for the target resource.

```json
{
  "errors" : [{     
      "code" : 401,
      "message" : "The user could not be authenticated for this request.",
      "description" : "The request has not been applied because it lacks valid authentication credentials for the target resource"
    }
  ]
}
```

#### 404

Not Found - server has not found a resource with that URI. This may be temporary and permanent condition. This status code is commonly used when the server does not wish to reveal exactly why the request has been refused, or when no other response is applicable.

```json
{
  "errors" : [{
     
      "code" : 404, 
       "message" : "The request is invalid or not properly formed.",
      "description" : "The requested operation failed because a resource associated with the request could not be found."
    }
  ]
}
```

#### 500

Internal Server Error - server encountered an error processing request. This should not happen normally, but it is a generic error message, given when no more specific message is suitable.

```json
{
  "errors" : [{
      "code" : 500,
      "message" : "The request failed due to an internal error.",
      "description": "error description"
    }
  ]
}
```

#### 503

Service Unavailable - temporary maintenance of service, try again later. The implication is that this is a temporary condition which will be alleviated after some delay. If known, the length of the delay will be indicated in a Retry-After header. If no Retry-After is given, the client SHOULD handle the response as it would for a 500 response. Note: The existence of the 503 status code does not imply that a server will use it when becoming overloaded. Servers may simply refuse the connection.