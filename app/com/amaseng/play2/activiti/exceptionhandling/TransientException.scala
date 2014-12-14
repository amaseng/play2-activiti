package com.amaseng.play2.activiti.exceptionhandling

/**
 * Wrapper for exceptions that may disappear when they are retried.
 */
class TransientException(message: String) extends RuntimeException(message)
