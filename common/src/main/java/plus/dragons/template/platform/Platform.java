package plus.dragons.template.platform;

public interface Platform {
	/**
	 * Gets the name of the current platform
	 *
	 * @return The name of the current platform.
	 */
	String getPlatformName();

	/**
	 * Checks if a mod with the given id is loaded.
	 *
	 * @param modId The mod to check if it is loaded.
	 * @return True if the mod is loaded, false otherwise.
	 */
	boolean isModLoaded(String modId);

	/**
	 * Gets the version of the mod with the given id.
	 * @param modId - The mod to check version.
	 * @return The version of the mod if the mod is loaded, "0" otherwise.
	 */
	String getModVersion(String modId);

	/**
	 * Check if the game is currently in a development environment.
	 *
	 * @return True if in a development environment, false otherwise.
	 */
	boolean isDevelopmentEnvironment();

	/**
	 * Gets the name of the environment type as a string.
	 *
	 * @return The name of the environment type.
	 */
	default String getEnvironmentName() {
		return isDevelopmentEnvironment() ? "development" : "production";
	}

	/**
	 * Check if the game distribution is client.jar.
	 *
	 * @return True if the game distribution is client.jar.
	 */
	boolean isClientDistribution();

	/**
	 * Gets the name of the game distribution as a string.
	 *
	 * @return The name of the game distribution.
	 */
	default String getDistributionName() {
		return isClientDistribution() ? "client" : "server";
	}
}
