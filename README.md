# spring-basics-profiles
A quick example of how profiles work in Spring

The @Profile annotation allows Spring to determine which beans should be created and maintained by the container. The annotation accepts can accept a single string describing the profile name or, it can be an array of strings for multiple profiles.

In the GreetingService file I have a @Profile annotation.

```
  @Profile({"FirstGreeting", "default"})
```

This is an example of multiple profiles, but it also demonstrates setting a default profile. By default, I mean that when an active profile is not specified under the application.properties, this component will be added to the container.

Under the SecondaryGreeting service there is a profile specified as well.

```
  @Profile("SecondaryGreeting")
```

This is an example of a single profile.

In order to switch the profiles, you need to add the following to the application properties.

```
  spring.profiles.active=SecondaryGreeting # or whatever name
```

You may also notice that the @Service annotation has specified a name for each service. In this example, both greeting services have different names, however, test them out with the same name. You will notice that Spring does not complain, because only 1 of them is being added to the container and injected into the GreetingController.

However, let's say we weren't using profiles, how would Spring know which service to inject into the GreetingController? Well, we would need to use the @Qualifier annotation to specify which implementation we wanted.


In the GreetingController
```
    public GreetingController(@Qualifier("secondaryGreeting") IGreeting greetingService) {
        this.greetingService = greetingService;
    }
```
This will ensure that the SecondaryGreeting service is the one that is injected into the GreetingController.

