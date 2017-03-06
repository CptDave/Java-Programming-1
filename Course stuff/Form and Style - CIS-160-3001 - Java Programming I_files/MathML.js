/**
* @namespace
*/
D2LMathML = {

	IsLatex: false,
	/**
	* @private
	*/
	m_message: '',

	/**
	* @private
	*/
	MobileInit: function (message) {
		D2LMathML.m_message = message;
	},

	DesktopInit: function (mathMLUrl, latexUrl) {

		(function () {
			var mathJaxConfig = {
				delayStartupUntil: "onload",
				showProcessingMessages: false,
				messageStyle: "none",
				menuSettings: {
					context: "MathJax",
					zoom: "None"
				},
				NativeMML: {
					showMathMenuMSIE: false,
					scale: 140
				},
				"HTML-CSS": {
					 linebreaks: {
					 	automatic: true,
					 	width: "container"
					 },
					 imageFont: null,
					 scale: 130
				}
			};

			var configScript = 'MathJax.Hub.Config(' + JSON.stringify( mathJaxConfig ) + ');';
			var script = document.createElement('script');
			script.type = 'text/x-mathjax-config';
			script.textContent = configScript;
			document.head.appendChild(script);

			var mathJaxScript = document.createElement('script');
			mathJaxScript.type = 'text/javascript';
			mathJaxScript.src = D2LMathML.IsLatex ? latexUrl : mathMLUrl;
			document.head.appendChild(mathJaxScript);

		})();

	}
};