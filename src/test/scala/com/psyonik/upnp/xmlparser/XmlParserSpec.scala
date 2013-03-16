package com.psyonik.upnp.xmlparser
import org.specs2.mutable.Specification
import org.specs2.specification.Scope
import org.specs2.mock.Mockito
import java.net.InetAddress
import scala.collection.JavaConversions._
import scala.collection.immutable.HashMap
import scala.collection.parallel.immutable.ParMap

import scala.io.Source


class XmlParserSpec extends Specification with Mockito {
  args(sequential = true)
  
  val testFilePath = "src/test/resources/com/psyonik/upnp/xmlparser/"
  

  trait system extends Scope {
    val xmlFile = new java.io.File(testFilePath + "InternetGatewayDevice.xml")
    
    xmlFile.exists() mustEqual true

    val bufferedSource = Source.fromFile(xmlFile)
    
  }

    
  

  "XmlParser" should {

    "be able to parse the xml" in new system {
    pending

    }

     "be able to parse if an element is missing" in new system {
  pending
    }

  }

}