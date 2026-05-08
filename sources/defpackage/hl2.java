package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class hl2 {
    public boolean a;
    public final Object b;

    public hl2() {
        this.b = new ArrayList();
    }

    public byte[] a() {
        ArrayList arrayList = (ArrayList) this.b;
        Iterator it = arrayList.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            byteBufferAllocate.put((byte[]) it2.next());
        }
        arrayList.clear();
        this.a = true;
        byte[] bArrArray = byteBufferAllocate.array();
        bArrArray.getClass();
        return bArrArray;
    }

    public void b() {
        this.a = false;
    }

    public void c(byte b) {
        ((rb8) this.b).d(b);
    }

    public void d(char c) {
        rb8 rb8Var = (rb8) this.b;
        rb8Var.a(rb8Var.b, 1);
        char[] cArr = rb8Var.a;
        int i = rb8Var.b;
        rb8Var.b = i + 1;
        cArr[i] = c;
    }

    public void e(int i) {
        ((rb8) this.b).d(i);
    }

    public void f(long j) {
        ((rb8) this.b).d(j);
    }

    public void g(short s) {
        ((rb8) this.b).d(s);
    }

    public void h(String str) {
        str.getClass();
        ((rb8) this.b).e(str);
    }

    public void i() {
    }

    public void j() {
    }

    public hl2(rb8 rb8Var) {
        this.b = rb8Var;
        this.a = true;
    }
}
