package performance

import java.nio.file.Path

import io.gatling.commons.util.PathHelper._

object IDEPathHelper {

  val gatlingConfUrl: Path = getClass.getClassLoader.getResource("gatling/gatling.conf")
  val projectRootDir = gatlingConfUrl.ancestor(4)

  val mavenSourcesDirectory = projectRootDir / "src" / "test" / "scala" / "performance"
  val mavenResourcesDirectory = projectRootDir / "src" / "test" / "resources" / "gatling"
  val mavenTargetDirectory = projectRootDir / "target"
  val mavenBinariesDirectory = mavenTargetDirectory / "test-classes"

  val dataDirectory = mavenResourcesDirectory / "data"
  val bodiesDirectory = mavenResourcesDirectory / "bodies"

  val recorderOutputDirectory = mavenSourcesDirectory
  val resultsDirectory = mavenTargetDirectory / "gatling"

  val recorderConfigFile = mavenResourcesDirectory / "recorder.conf"
}
