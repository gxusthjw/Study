package cn.edu.gxust.jiweihuang.scala.study.hipparchus

import org.hipparchus.stat.correlation.Covariance

object StudyCovariance extends App {
  val data_array0 = Array[Double](3.2, 2.0, 6.0, 5.3, 2.0, 3.1, 2.5, 3.6, 2.5)
  val covarianceObject = new Covariance()
  println(s"covarianceObject.covariance(data_array0, data_array0) = ${covarianceObject.covariance(data_array0, data_array0)}")
  println(s"covarianceObject.covariance(data_array0, data_array0) = ${covarianceObject.covariance(data_array0, data_array0, false)}")
  println(covarianceObject.getN)
  println(covarianceObject.getCovarianceMatrix)
}
