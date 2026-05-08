package androidx.media3.extractor.flv;

import androidx.media3.common.ParserException;
import defpackage.zpf;

/* JADX INFO: loaded from: classes.dex */
public abstract class TagPayloadReader {
    public final zpf a;

    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    public TagPayloadReader(zpf zpfVar) {
        this.a = zpfVar;
    }
}
