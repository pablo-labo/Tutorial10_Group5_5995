package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import defpackage.bh1;
import defpackage.dh1;
import defpackage.f5d;
import defpackage.fva;
import defpackage.g94;
import defpackage.j5d;
import defpackage.l5;
import defpackage.ova;
import defpackage.r6;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class VideoDecoder<T> implements j5d<T, Bitmap> {
    public static final fva<Long> d = new fva<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());
    public static final fva<Integer> e = new fva<>("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());
    public static final f f = new f();
    public static final List<String> g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));
    public final e<T> a;
    public final bh1 b;
    public final f c = f;

    public static final class VideoDecoderException extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public VideoDecoderException() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public class a implements fva.b<Long> {
        public final ByteBuffer a = ByteBuffer.allocate(8);

        @Override // fva.b
        public final void a(byte[] bArr, Long l, MessageDigest messageDigest) {
            Long l2 = l;
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l2.longValue()).array());
            }
        }
    }

    public class b implements fva.b<Integer> {
        public final ByteBuffer a = ByteBuffer.allocate(4);

        @Override // fva.b
        public final void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putInt(num2.intValue()).array());
            }
        }
    }

    public static final class c implements e<AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        public final void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaExtractor.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    public static final class d implements e<ByteBuffer> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        public final void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new com.bumptech.glide.load.resource.bitmap.a(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new com.bumptech.glide.load.resource.bitmap.a(byteBuffer));
        }
    }

    public interface e<T> {
        void a(MediaExtractor mediaExtractor, T t);

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    public static class f {
    }

    public static final class g implements e<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        public final void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.VideoDecoder.e
        public final void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    public VideoDecoder(bh1 bh1Var, e<T> eVar) {
        this.b = bh1Var;
        this.a = eVar;
    }

    @Override // defpackage.j5d
    public final boolean a(T t, ova ovaVar) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j5d
    public final f5d<Bitmap> b(T t, int i, int i2, ova ovaVar) throws Exception {
        boolean zIsTerminated;
        boolean zIsTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        long jLongValue = ((Long) ovaVar.c(d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            l5.q(r6.c(jLongValue, "Requested frame must be non-negative, or DEFAULT_FRAME, given: "));
            return null;
        }
        int i3 = (Integer) ovaVar.c(e);
        if (i3 == null) {
            i3 = 2;
        }
        g94 g94Var = (g94) ovaVar.c(g94.d);
        if (g94Var == null) {
            g94Var = g94.c;
        }
        g94 g94Var2 = g94Var;
        this.c.getClass();
        Integer num = i3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        boolean z = false;
        try {
            this.a.b(mediaMetadataRetriever, t);
            Bitmap bitmapC = c(t, mediaMetadataRetriever, jLongValue, num.intValue(), i, i2, g94Var2);
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) mediaMetadataRetriever;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated2 = executorService.isTerminated())) {
                    executorService.shutdown();
                    while (!zIsTerminated2) {
                        try {
                            zIsTerminated2 = executorService.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            return new dh1(this.b, bitmapC);
        } catch (Throwable th) {
            if (Build.VERSION.SDK_INT < 29) {
                mediaMetadataRetriever.release();
            } else if (mediaMetadataRetriever instanceof AutoCloseable) {
                mediaMetadataRetriever.close();
            } else if (mediaMetadataRetriever instanceof ExecutorService) {
                ExecutorService executorService2 = (ExecutorService) mediaMetadataRetriever;
                if (executorService2 != ForkJoinPool.commonPool() && !(zIsTerminated = executorService2.isTerminated())) {
                    executorService2.shutdown();
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService2.awaitTermination(1L, timeUnit);
                        } catch (InterruptedException unused2) {
                            if (!z) {
                                executorService2.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else {
                mediaMetadataRetriever.release();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0062 A[Catch: all -> 0x0068, TRY_LEAVE, TryCatch #3 {all -> 0x0068, blocks: (B:23:0x005c, B:25:0x0062), top: B:93:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0183 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap c(T r14, android.media.MediaMetadataRetriever r15, long r16, int r18, int r19, int r20, defpackage.g94 r21) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.VideoDecoder.c(java.lang.Object, android.media.MediaMetadataRetriever, long, int, int, int, g94):android.graphics.Bitmap");
    }
}
