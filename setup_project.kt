import java.io.File

fun main() {
    val baseDir = File("investment-portfolio-project")

    // Create directories
    val dataDir = File(baseDir, "data")
    val notebooksDir = File(baseDir, "notebooks")
    val scriptsDir = File(baseDir, "scripts")

    listOf(dataDir, notebooksDir, scriptsDir).forEach { it.mkdirs() }

    // Create files in the data directory
    File(dataDir, "synthetic_portfolio.csv").createNewFile()

    // Create notebook files
    listOf(
        "01_data_generation.ipynb",
        "02_data_cleaning.ipynb",
        "03_backtesting.ipynb",
        "04_signal_prediction.ipynb"
    ).forEach { notebook ->
        File(notebooksDir, notebook).createNewFile()
    }

    // Create script files
    listOf(
        "generate_portfolio.py",
        "clean_data.py",
        "backtest_strategy.py",
        "predict_signals.py"
    ).forEach { script ->
        File(scriptsDir, script).createNewFile()
    }

    // Create other root files
    File(baseDir, "requirements.txt").createNewFile()
    File(baseDir, "README.md").createNewFile()
    File(baseDir, "LICENSE").createNewFile()

    println("Project structure created successfully!")
}
