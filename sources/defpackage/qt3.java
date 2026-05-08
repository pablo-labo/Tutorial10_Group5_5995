package defpackage;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.extractor.text.SubtitleDecoderException;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class qt3 extends qfe implements xxe {
    public final dye n;

    public qt3(dye dyeVar) {
        super(new aye[2], new bye[2]);
        int i = this.g;
        DecoderInputBuffer[] decoderInputBufferArr = this.e;
        ka2.q(i == decoderInputBufferArr.length);
        for (DecoderInputBuffer decoderInputBuffer : decoderInputBufferArr) {
            decoderInputBuffer.p(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
        this.n = dyeVar;
    }

    @Override // defpackage.xxe
    public final void a(long j) {
    }

    @Override // defpackage.qfe
    public final DecoderInputBuffer g() {
        return new aye();
    }

    @Override // defpackage.qfe
    public final ck3 h() {
        return new lge(this);
    }

    @Override // defpackage.qfe
    public final DecoderException i(Throwable th) {
        return new SubtitleDecoderException("Unexpected decode error", th);
    }

    @Override // defpackage.qfe
    public final DecoderException j(DecoderInputBuffer decoderInputBuffer, ck3 ck3Var, boolean z) {
        aye ayeVar = (aye) decoderInputBuffer;
        bye byeVar = (bye) ck3Var;
        try {
            ByteBuffer byteBuffer = ayeVar.d;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            dye dyeVar = this.n;
            if (z) {
                dyeVar.reset();
            }
            wxe wxeVarA = dyeVar.a(0, bArrArray, iLimit);
            long j = ayeVar.f;
            long j2 = ayeVar.X;
            byeVar.b = j;
            byeVar.d = wxeVarA;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            byeVar.e = j;
            byeVar.c = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }
}
