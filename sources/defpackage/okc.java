package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function1;
import kotlinx.serialization.json.JsonElement;
import org.webrtc.SoftwareVideoDecoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;

/* JADX INFO: loaded from: classes2.dex */
@sy3
public final class okc implements VideoDecoderFactory {
    public static okc b;
    public Object a;

    public okc(int i) {
        switch (i) {
            case 2:
                this.a = new ReentrantReadWriteLock();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public synchronized VideoDecoderFactory a() {
        try {
            if (((SoftwareVideoDecoderFactory) this.a) == null) {
                this.a = new SoftwareVideoDecoderFactory();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (SoftwareVideoDecoderFactory) this.a;
    }

    public JsonElement b(String str, JsonElement jsonElement) {
        str.getClass();
        jsonElement.getClass();
        return (JsonElement) ((LinkedHashMap) this.a).put(str, jsonElement);
    }

    public Object c(gu5 gu5Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = (ReentrantReadWriteLock) this.a;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            return gu5Var.invoke();
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return a().createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return a().getSupportedCodecs();
    }

    public okc(Function1 function1) {
        function1.getClass();
        this.a = function1;
    }
}
