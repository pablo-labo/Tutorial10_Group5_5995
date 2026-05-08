package defpackage;

import android.graphics.Bitmap;
import defpackage.o17;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class p17 implements o17.a {
    public final /* synthetic */ jge<Bitmap> a;

    public p17(jge<Bitmap> jgeVar) {
        this.a = jgeVar;
    }

    @Override // o17.a
    public final void a(Bitmap bitmap) {
        jge<Bitmap> jgeVar = this.a;
        CountDownLatch countDownLatch = jgeVar.a;
        if (countDownLatch.getCount() == 0) {
            b0.o("Result has already been set!");
        } else {
            jgeVar.b = bitmap;
            countDownLatch.countDown();
        }
    }

    @Override // o17.a
    public final void onFailure(Exception exc) {
        ExecutionException executionException = new ExecutionException(exc);
        jge<Bitmap> jgeVar = this.a;
        CountDownLatch countDownLatch = jgeVar.a;
        if (countDownLatch.getCount() == 0) {
            b0.o("Result has already been set!");
        } else {
            jgeVar.c = executionException;
            countDownLatch.countDown();
        }
    }
}
