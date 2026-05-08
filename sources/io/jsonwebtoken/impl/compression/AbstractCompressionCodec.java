package io.jsonwebtoken.impl.compression;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import io.jsonwebtoken.CompressionCodec;
import io.jsonwebtoken.CompressionException;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractCompressionCodec implements CompressionCodec {

    public interface StreamWrapper {
        OutputStream wrap(OutputStream outputStream);
    }

    @Override // io.jsonwebtoken.CompressionCodec
    public final byte[] compress(byte[] bArr) {
        Assert.notNull(bArr, "payload cannot be null.");
        try {
            return doCompress(bArr);
        } catch (IOException e) {
            throw new CompressionException("Unable to compress payload.", e);
        }
    }

    @Override // io.jsonwebtoken.CompressionCodec
    public final byte[] decompress(byte[] bArr) {
        Assert.notNull(bArr, "compressed bytes cannot be null.");
        try {
            return doDecompress(bArr);
        } catch (IOException e) {
            throw new CompressionException("Unable to decompress bytes.", e);
        }
    }

    public abstract byte[] doCompress(byte[] bArr);

    public abstract byte[] doDecompress(byte[] bArr);

    public byte[] readAndClose(InputStream inputStream) {
        byte[] bArr = new byte[IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
        try {
            int i = inputStream.read(bArr);
            while (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
                i = inputStream.read(bArr);
            }
            Objects.nullSafeClose(inputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            Objects.nullSafeClose(inputStream);
            throw th;
        }
    }

    public byte[] writeAndClose(byte[] bArr, StreamWrapper streamWrapper) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING);
        OutputStream outputStreamWrap = streamWrapper.wrap(byteArrayOutputStream);
        try {
            outputStreamWrap.write(bArr);
            outputStreamWrap.flush();
            Objects.nullSafeClose(outputStreamWrap);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            Objects.nullSafeClose(outputStreamWrap);
            throw th;
        }
    }
}
