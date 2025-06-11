Investment Portfolio Project
Overview
This project is designed to generate, clean, backtest, and predict signals for an investment portfolio using synthetic data. The project is structured to facilitate easy navigation and execution of different stages of the investment analysis pipeline.

Project Structure
The project is organized as follows:

Copiar
investment-portfolio-project/
├── data/
│   └── synthetic_portfolio.csv
├── notebooks/
│   ├── 01_data_generation.ipynb
│   ├── 02_data_cleaning.ipynb
│   ├── 03_backtesting.ipynb
│   └── 04_signal_prediction.ipynb
├── scripts/
│   ├── generate_portfolio.py
│   ├── clean_data.py
│   ├── backtest_strategy.py
│   └── predict_signals.py
├── requirements.txt
├── README.md
└── LICENSE
data/: Contains the synthetic portfolio data in CSV format.
notebooks/: Jupyter notebooks for different stages of the analysis:
01_data_generation.ipynb: Generates synthetic portfolio data.
02_data_cleaning.ipynb: Cleans and preprocesses the data.
03_backtesting.ipynb: Performs backtesting of investment strategies.
04_signal_prediction.ipynb: Predicts investment signals.
scripts/: Python scripts to perform the same tasks as the notebooks:
generate_portfolio.py: Script to generate synthetic portfolio data.
clean_data.py: Script to clean and preprocess the data.
backtest_strategy.py: Script to backtest investment strategies.
predict_signals.py: Script to predict investment signals.
requirements.txt: Lists all the Python dependencies required for the project.
README.md: Provides an overview and instructions for the project.
LICENSE: Contains the license information for the project.
Getting Started
Prerequisites
Python 3.x
Jupyter Notebook (for running the notebooks)
Required Python packages (listed in requirements.txt)
Installation
Clone the repository:

Copiar
git clone <repository-url>
Navigate to the project directory:

Copiar
cd investment-portfolio-project
Install the required packages:

Copiar
pip install -r requirements.txt
Usage
Generating Data: Run the 01_data_generation.ipynb notebook or the generate_portfolio.py script to generate synthetic portfolio data.
Cleaning Data: Use the 02_data_cleaning.ipynb notebook or the clean_data.py script to clean and preprocess the data.
Backtesting: Perform backtesting using the 03_backtesting.ipynb notebook or the backtest_strategy.py script.
Predicting Signals: Predict investment signals with the 04_signal_prediction.ipynb notebook or the predict_signals.py script.
License
This project is licensed under the MIT License.

Contact
For any questions or suggestions, please feel free to reach out.