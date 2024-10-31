import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.cio.*
import io.ktor.server.engine.*
import io.ktor.server.response.*
import io.ktor.server.routing.*


fun main() {
    embeddedServer(
        factory = CIO,
        port = 32165,
        host = "0.0.0.0"
    ){
        routing {
            get("/"){
                call.respondText("HELLO WORLD!", contentType = ContentType.Text.Plain)
            }
        }
    }.start(wait = true)
}