package beta.application.betaApplication

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BetaApplication

fun main(args: Array<String>) {
	runApplication<BetaApplication>(*args)
}
