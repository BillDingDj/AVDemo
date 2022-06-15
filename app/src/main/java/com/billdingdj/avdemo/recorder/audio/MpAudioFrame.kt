package com.billdingdj.avdemo.recorder.audio

import android.media.MediaCodec.BufferInfo
import com.billdingdj.avdemo.recorder.MpFrame
import com.billdingdj.avdemo.recorder.MpFrameType
import java.nio.ByteBuffer

class MpAudioFrame : MpFrame {

    private val mByteBuffer: ByteBuffer
    private val mBufferInfo: BufferInfo

    constructor(inputBuffer: ByteBuffer, bufferInfo: BufferInfo): super(MpFrameType.BUFFER) {
        mByteBuffer = inputBuffer
        mBufferInfo = bufferInfo
    }
}
