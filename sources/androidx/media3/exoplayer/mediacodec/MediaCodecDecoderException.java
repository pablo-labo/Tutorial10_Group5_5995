package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.decoder.DecoderException;

/* JADX INFO: loaded from: classes.dex */
public class MediaCodecDecoderException extends DecoderException {
    public final d codecInfo;
    public final String diagnosticInfo;
    public final int errorCode;

    public MediaCodecDecoderException(IllegalStateException illegalStateException, d dVar) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(dVar == null ? null : dVar.a);
        super(sb.toString(), illegalStateException);
        this.codecInfo = dVar;
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        this.diagnosticInfo = z ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null;
        this.errorCode = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
