package com.baojie.getset.webfluxdemo.controller;


import com.baojie.getset.webfluxdemo.model.MyEvent;
import com.baojie.getset.webfluxdemo.repository.MyEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/events")
public class MyEventController {
    @Autowired
    private MyEventRepository myEventRepository;

    @PostMapping(path = "", consumes = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Mono<Void> loadEvents(@RequestBody Flux<MyEvent> events) {
        return this.myEventRepository.insert(events).then();
    }

    @GetMapping(path = "", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
    public Flux<MyEvent> getEvents() {
        return this.myEventRepository.findBy();
    }
}
