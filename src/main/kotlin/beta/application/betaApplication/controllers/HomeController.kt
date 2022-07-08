package beta.application.betaApplication.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.io.IOException
import javax.servlet.ServletException
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse


@RestController
@RequestMapping("/home")
class HomeController {


    @GetMapping("/health.check")
    @Throws(ServletException::class, IOException::class)
    private fun doHealthCheck(req: HttpServletRequest?, res: HttpServletResponse?): ResponseEntity<String?>? {
        return ResponseEntity.ok().build()
    }
}