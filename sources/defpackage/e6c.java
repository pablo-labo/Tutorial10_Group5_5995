package defpackage;

import com.google.firebase.encoders.EncodingException;

/* JADX INFO: loaded from: classes2.dex */
public final class e6c implements nlg {
    public boolean a = false;
    public boolean b = false;
    public x85 c;
    public final b6c d;

    public e6c(b6c b6cVar) {
        this.d = b6cVar;
    }

    @Override // defpackage.nlg
    public final nlg c(String str) {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.k(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.nlg
    public final nlg e(boolean z) {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
        this.d.e(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
