package app.rive.runtime.kotlin.controllers;

import app.rive.runtime.kotlin.core.Artboard;
import app.rive.runtime.kotlin.core.File;
import app.rive.runtime.kotlin.core.LinearAnimationInstance;
import app.rive.runtime.kotlin.core.StateMachineInstance;
import com.datadog.android.log.internal.domain.DatadogLogGenerator;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@ControllerStateManagement
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001Bm\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\tj\b\u0012\u0004\u0012\u00020\u0007`\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0006\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\tj\b\u0012\u0004\u0012\u00020\f`\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR'\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00070\tj\b\u0012\u0004\u0012\u00020\u0007`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00068\u0006¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\"\u0010\u001eR'\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\tj\b\u0012\u0004\u0012\u00020\f`\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b\u0010\u0010%¨\u0006&"}, d2 = {"Lapp/rive/runtime/kotlin/controllers/ControllerState;", "", "Lapp/rive/runtime/kotlin/core/File;", "file", "Lapp/rive/runtime/kotlin/core/Artboard;", "activeArtboard", "", "Lapp/rive/runtime/kotlin/core/LinearAnimationInstance;", "animations", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "playingAnimations", "Lapp/rive/runtime/kotlin/core/StateMachineInstance;", "stateMachines", "playingStateMachines", "", "isActive", "<init>", "(Lapp/rive/runtime/kotlin/core/File;Lapp/rive/runtime/kotlin/core/Artboard;Ljava/util/List;Ljava/util/HashSet;Ljava/util/List;Ljava/util/HashSet;Z)V", "Lj6g;", "dispose", "()V", "Lapp/rive/runtime/kotlin/core/File;", "getFile", "()Lapp/rive/runtime/kotlin/core/File;", "Lapp/rive/runtime/kotlin/core/Artboard;", "getActiveArtboard", "()Lapp/rive/runtime/kotlin/core/Artboard;", "Ljava/util/List;", "getAnimations", "()Ljava/util/List;", "Ljava/util/HashSet;", "getPlayingAnimations", "()Ljava/util/HashSet;", "getStateMachines", "getPlayingStateMachines", "Z", "()Z", "kotlin_release"}, k = 1, mv = {1, DatadogLogGenerator.CRASH, 0}, xi = 48)
public final class ControllerState {
    public static final int $stable = 8;
    private final Artboard activeArtboard;
    private final List<LinearAnimationInstance> animations;
    private final File file;
    private final boolean isActive;
    private final HashSet<LinearAnimationInstance> playingAnimations;
    private final HashSet<StateMachineInstance> playingStateMachines;
    private final List<StateMachineInstance> stateMachines;

    public ControllerState(File file, Artboard artboard, List<LinearAnimationInstance> list, HashSet<LinearAnimationInstance> hashSet, List<StateMachineInstance> list2, HashSet<StateMachineInstance> hashSet2, boolean z) {
        file.getClass();
        artboard.getClass();
        list.getClass();
        hashSet.getClass();
        list2.getClass();
        hashSet2.getClass();
        this.file = file;
        this.activeArtboard = artboard;
        this.animations = list;
        this.playingAnimations = hashSet;
        this.stateMachines = list2;
        this.playingStateMachines = hashSet2;
        this.isActive = z;
    }

    public final void dispose() {
        this.file.release();
        this.activeArtboard.release();
    }

    public final Artboard getActiveArtboard() {
        return this.activeArtboard;
    }

    public final List<LinearAnimationInstance> getAnimations() {
        return this.animations;
    }

    public final File getFile() {
        return this.file;
    }

    public final HashSet<LinearAnimationInstance> getPlayingAnimations() {
        return this.playingAnimations;
    }

    public final HashSet<StateMachineInstance> getPlayingStateMachines() {
        return this.playingStateMachines;
    }

    public final List<StateMachineInstance> getStateMachines() {
        return this.stateMachines;
    }

    /* JADX INFO: renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }
}
