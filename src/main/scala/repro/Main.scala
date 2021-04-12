package repro
import scala.App
import com.twitter.finagle.tracing.DefaultTracer
import zipkin2.finagle.http.HttpZipkinTracer

object Main extends App {
  assert(DefaultTracer.self.isInstanceOf[HttpZipkinTracer])
}
