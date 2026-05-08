package androidx.media3.common.audio;

import androidx.media3.common.audio.AudioProcessor;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {
    @Override // androidx.media3.common.audio.b
    public final AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        int i = aVar.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 21 || i == 1342177280 || i == 22 || i == 1610612736 || i == 4) {
            return i != 2 ? new AudioProcessor.a(aVar.a, aVar.b, 2) : AudioProcessor.a.e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // androidx.media3.common.audio.AudioProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.nio.ByteBuffer r12) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.audio.d.e(java.nio.ByteBuffer):void");
    }
}
