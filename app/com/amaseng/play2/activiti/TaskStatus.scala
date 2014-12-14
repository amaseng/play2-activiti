package com.amaseng.play2.activiti

sealed trait TaskStatus

object TaskStatus {
  case object OK extends TaskStatus
  case object WARNING extends TaskStatus
  case object ERROR extends TaskStatus
}
