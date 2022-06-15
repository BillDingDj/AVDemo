package com.billdingdj.avdemo.recorder.audio

import com.billdingdj.avdemo.recorder.audio.MpAudioFrame

interface MpAudioCaptureListener {

    fun onError(error: Int, errorMsg: String?)

    fun onFrameAvailable(frame: MpAudioFrame?)
}