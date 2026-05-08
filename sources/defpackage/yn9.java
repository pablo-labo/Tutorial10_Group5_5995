package defpackage;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream;
import com.facebook.imagepipeline.memory.b;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class yn9 {
    public final Object a;
    public final Object b;

    public yn9(Object obj) {
        this.a = obj;
        this.b = Thread.currentThread();
    }

    public xn9 a(InputStream inputStream) {
        inputStream.getClass();
        b bVar = (b) this.a;
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream(bVar, bVar.Y[0]);
        try {
            ((cgb) this.b).a(inputStream, memoryPooledByteBufferOutputStream);
            return memoryPooledByteBufferOutputStream.a();
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    public xn9 b(InputStream inputStream, int i) {
        inputStream.getClass();
        MemoryPooledByteBufferOutputStream memoryPooledByteBufferOutputStream = new MemoryPooledByteBufferOutputStream((b) this.a, i);
        try {
            ((cgb) this.b).a(inputStream, memoryPooledByteBufferOutputStream);
            return memoryPooledByteBufferOutputStream.a();
        } finally {
            memoryPooledByteBufferOutputStream.close();
        }
    }

    public MemoryPooledByteBufferOutputStream c() {
        b bVar = (b) this.a;
        return new MemoryPooledByteBufferOutputStream(bVar, bVar.Y[0]);
    }

    public yn9(b bVar, cgb cgbVar) {
        cgbVar.getClass();
        this.a = bVar;
        this.b = cgbVar;
    }
}
