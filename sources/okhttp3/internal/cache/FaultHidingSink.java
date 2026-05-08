package okhttp3.internal.cache;

import defpackage.eq5;
import defpackage.fie;
import defpackage.j6g;
import defpackage.zn1;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/FaultHidingSink;", "Leq5;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FaultHidingSink extends eq5 {
    public final Function1<IOException, j6g> b;
    public boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FaultHidingSink(fie fieVar, Function1<? super IOException, j6g> function1) {
        super(fieVar);
        fieVar.getClass();
        this.b = function1;
    }

    @Override // defpackage.eq5, defpackage.fie
    public final void I1(zn1 zn1Var, long j) throws EOFException {
        zn1Var.getClass();
        if (this.c) {
            zn1Var.skip(j);
            return;
        }
        try {
            this.a.I1(zn1Var, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.eq5, defpackage.fie, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.c) {
            return;
        }
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.eq5, defpackage.fie, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}
