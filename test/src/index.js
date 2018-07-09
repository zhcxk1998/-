import React from 'react';
import ReactDOM from 'react-dom';
import './css/test.css';
import Ball from '../src/component/ball';
import Show from '../src/component/card';
import CountParent from '../src/component/count';
import Form from '../src/component/form';
import App from '../src/component/app';
import registerServiceWorker from './registerServiceWorker';

ReactDOM.render(<App/>, document.getElementById('app'));
ReactDOM.render(<Form/>, document.getElementById('bbb'));
ReactDOM.render(<CountParent/>, document.getElementById('count'));
ReactDOM.render(<Show/>, document.getElementById('aaa'));
ReactDOM.render(<Ball/>, document.getElementById('root'));
registerServiceWorker();
