package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import defpackage.kt0;
import defpackage.pr1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static int a(List<ImageHeaderParser> list, InputStream inputStream, kt0 kt0Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, kt0Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                int iA = list.get(i).a(inputStream, kt0Var);
                if (iA != -1) {
                    return iA;
                }
            } finally {
                inputStream.reset();
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType b(List<ImageHeaderParser> list, InputStream inputStream, kt0 kt0Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new RecyclableBufferedInputStream(inputStream, kt0Var);
        }
        inputStream.mark(5242880);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType imageTypeC = list.get(i).c(inputStream);
                inputStream.reset();
                if (imageTypeC != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeC;
                }
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static ImageHeaderParser.ImageType c(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            try {
                ImageHeaderParser.ImageType imageTypeB = list.get(i).b(byteBuffer);
                pr1.c(byteBuffer);
                if (imageTypeB != ImageHeaderParser.ImageType.UNKNOWN) {
                    return imageTypeB;
                }
            } catch (Throwable th) {
                pr1.c(byteBuffer);
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
