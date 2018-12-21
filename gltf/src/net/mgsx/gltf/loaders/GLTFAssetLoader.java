package net.mgsx.gltf.loaders;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetLoaderParameters;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.AsynchronousAssetLoader;
import com.badlogic.gdx.assets.loaders.FileHandleResolver;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.utils.Array;

import net.mgsx.gltf.scene3d.scene.SceneAsset;

public class GLTFAssetLoader  extends AsynchronousAssetLoader<SceneAsset, AssetLoaderParameters<SceneAsset>>{

	public GLTFAssetLoader(FileHandleResolver resolver) {
		super(resolver);
	}

	@Override
	public void loadAsync(AssetManager manager, String fileName, FileHandle file,
			AssetLoaderParameters<SceneAsset> parameter) {
	}

	@Override
	public SceneAsset loadSync(AssetManager manager, String fileName, FileHandle file,
			AssetLoaderParameters<SceneAsset> parameter) {
		SceneAsset sceneAsset = new GLTFLoader().load(file, file.parent());
		return sceneAsset;
	}

	@Override
	public Array<AssetDescriptor> getDependencies(String fileName, FileHandle file,
			AssetLoaderParameters<SceneAsset> parameter) {
		return null;
	}

}
