package defpackage;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import defpackage.fo1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.apache.avro.AvroRuntimeException;

/* JADX INFO: loaded from: classes3.dex */
public class bt4 {
    public static final a b = new a();
    public int a = 2048;

    public static class a extends bt4 {
    }

    public final fo1 a(ByteArrayOutputStream byteArrayOutputStream) {
        int i = this.a;
        fo1 fo1Var = new fo1();
        if (fo1Var.c != null && fo1Var.b > 0) {
            try {
                fo1Var.k();
            } catch (IOException e) {
                throw new AvroRuntimeException("Failure flushing old output", e);
            }
        }
        fo1Var.c = new fo1.b(byteArrayOutputStream);
        fo1Var.b = 0;
        byte[] bArr = fo1Var.a;
        if (bArr == null || bArr.length != i) {
            fo1Var.a = new byte[i];
        }
        int length = fo1Var.a.length >>> 1;
        fo1Var.d = length;
        if (length > 512) {
            fo1Var.d = IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING;
        }
        return fo1Var;
    }
}
