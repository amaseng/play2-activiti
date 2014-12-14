package com.amaseng.play2.activiti

import org.activiti.engine.ProcessEngineConfiguration

trait Configurator {
  def configure(configuration: ProcessEngineConfiguration): ProcessEngineConfiguration
}
