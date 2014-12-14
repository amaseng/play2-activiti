package com.amaseng.play2.activiti

import org.activiti.engine.ProcessEngine

/**
 * Trait providing an Activiti `ProcessEngine`
 */
trait HasEngine {
  def engine: ProcessEngine
}
