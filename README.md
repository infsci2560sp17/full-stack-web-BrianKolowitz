# Online Opinions about At Home Workouts

1. What is the proposed name for your Web application?
    - WORKINGout
2. Who is the target audience for your Web application?
    - Working professionals with limited time to go to the gym but are health concious.
3. What problem is it intended to solve for the target audience?
    - There's hundreds of at home workout programs. Some are better than others, and some aren't very good at all. Sorting through these workouts is a challenge and working professionals don't have a place where they can share experiences. I'll provide workout reviews, individualized recommendations and coaching (for a price), and motiviational material.
4. How will it meet the minimum project requirements?
    - My site will use the freemium model. Most of the content will be freely accessible without a login. If users want to interact with each other, a login will be required which I'll store in my database. I'll also support OAuth2 authentication if the users do not want to create an username and password on my site. Once the user is signed up for the site I'll have 2 roles (free, and paid). Paid users will have access to additional parts of the web site. Paid users will also have to enter payment info. I'll use PayPal for payments. All public data will be accessible through RESTful services. All RESTful services will data in both JSON and XML formats. 
5. Why is your proposed Web application unique or creative beyond simply meeting the minimum requirements?
     - My site will customize the experience to the users behaviors. I'll track site usage, interactions with others, and content viewed to provide a customized experience. I'll engage active users with advice on how to advance their training. I'll engage inactive users by sending motivational messages encouraging them to join the community.


## Build status

[![Build Status](https://travis-ci.org/infsci2560sp17/full-stack-web-BrianKolowitz.svg?branch=master)](https://travis-ci.org/infsci2560sp17/full-stack-web-BrianKolowitz)

## Changelog

[Changelog](CHANGELOG.md)

## Web Site

[Workout DVD's by Brian](https://infinite-brushlands-87048.herokuapp.com/)

![](http://2.gravatar.com/avatar/de2ae7576c1b5e262c787dc3c201418d.png)


## Key Features

TODO : Please list key features of your project.

* Key Feature 1
* Key Feature 2
* Key Feature N

## Project Details

### Landing Page

TODO : please provide a description of your landing page inluding a screen shot ![](https://.../image.JPG)

### User Input Form

TODO : please provide a description of at least 1 user input form including a screen shot ![](https://.../image.jpg)

## API

TODO : please provide a description of at least 1 API including a sample of request data and response data in both XML and JSON format.

### API Method 1

    POST photos/:id/tags

#### Parameters

- **id** _(required)_ — The Photo ID to add tags for.
- **tags** _(required)_ — Comma separated tags.

#### Response

A JSON or XMLobject containing the PhotoID and list of tags accepted.

#### Errors

All known errors cause the resource to return HTTP error code header together with a JSON array containing at least 'status' and 'error' keys describing the source of error.

- **404 Not Found** — The photo was not found.

#### Example

##### Request

    POST /v1/photos/123456/tags

##### Body

    tags=cute,puppy


##### JSON Response

```json
{
    "photoId": 123456,
    "tags": ["cute", "puppy"]
}
```

##### XML Response

```xml
<?xml version="1.0" encoding="UTF-8"?>
<PhotoTags>
    <photoId>123456</PhotoId>
        <tags>
            <tag>cute</tag>
            <tag>puppy</tag>
        </tags>
</PhotoTags>
```

## Technologies Used

TODO : List all technologies used in your project

- [Spring Boot](https://projects.spring.io/spring-boot/) - Takes an opinionated view of building production-ready Spring applications.
- [Thymleaf](http://www.thymeleaf.org/) - Thymeleaf is a modern server-side Java template engine for both web and standalone environments.
- [Maven](https://maven.apache.org/) - Apache Maven is a software project management and comprehension tool.
