package defpackage;

import com.canhub.cropper.CropImageView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class d73 {
    public final Object a;
    public final Object b;

    public d73() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
        this.a = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public byte[] a(g05 g05Var) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.b;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(g05Var.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(g05Var.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(g05Var.c);
            dataOutputStream.writeLong(g05Var.d);
            dataOutputStream.write(g05Var.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            l5.r(e);
            return null;
        }
    }

    public d73(CropImageView cropImageView, CropImageView cropImageView2) {
        this.a = cropImageView;
        this.b = cropImageView2;
    }
}
