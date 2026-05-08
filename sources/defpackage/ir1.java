package defpackage;

import defpackage.p85;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ir1 implements p85 {
    public final ByteBuffer a;
    public final nva b;

    public static final class a implements p85.a<ByteBuffer> {
        @Override // p85.a
        public final p85 a(Object obj, nva nvaVar, xqc xqcVar) {
            return new ir1((ByteBuffer) obj, nvaVar);
        }
    }

    public ir1(ByteBuffer byteBuffer, nva nvaVar) {
        this.a = byteBuffer;
        this.b = nvaVar;
    }

    @Override // defpackage.p85
    public final Object a(lu2<? super l85> lu2Var) {
        ByteBuffer byteBuffer = this.a;
        return new rne(new une(new uqc(new jr1(byteBuffer)), this.b.f, new nr1(byteBuffer)), null, we3.b);
    }
}
