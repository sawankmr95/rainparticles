package com.premsinghdaksha.rain_particles.psd.models

/**
 * ConfettiConfig is a simple data class to set some
 * specific configurations for confetti upon creation
 * Created by Prem singh daksha.
 */
data class RainParticlesConfig(
    var fadeOut: Boolean = false,
    var timeToLive: Long = 2000L,
    var rotate: Boolean = true,
    var accelerate: Boolean = true,
    var delay: Long = 0L
)
