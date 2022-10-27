package org.expo.nothanks.controller


import org.expo.nothanks.model.event.input.ConnectRequest
import org.expo.nothanks.service.GameService
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.simp.annotation.SubscribeMapping
import org.springframework.stereotype.Controller


@Controller
class GameController(
    val gameService: GameService
) {

}