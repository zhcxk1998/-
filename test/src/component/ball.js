import React from 'react';
import $ from 'jquery';

// import './css/test.css';
// import './component/ball';
// import {Header, Aaa} from "./component/ball";
// var script = document.createElement("script");
// script.type = "text/javascript";
// script.src = "https://cdn.bootcss.com/jquery/1.10.2/jquery.min.j";
// document.getElementsByTagName('head')[0].appendChild(script);
// $(function () {
//     $('bb').click(function () {
//         $('div').toggle();
//     });
// });


const arr = [
    {"name": "啊", "color": "red"},
    {"name": "嗝", "color": "blue"},
    {"name": "嘎", "color": "yellow"},
    {"name": "嗷", "color": "gray"},
    {"name": "吖", "color": "green"},
    {"name": "呀", "color": "purple"},
    {"name": "吼", "color": "orange"},
    {"name": "嘻", "color": "pink"},
];

class Header extends React.Component {

    render() {
        const letterStyle = {
            padding: "20px",
            margin: "20px 20px",
            backgroundColor: this.props.bg,
            color: "white",
            display: "inline-block",
            fontFamily: "琥珀",
            fontSize: "20px",
            textAlign: "center",
            verticalAlign: "center",
            width: "20px",
            height: "20px",
            animation: this.props.animation,
        };

        return (
            <div>
                <div id={"aoao"} style={{display: "inline-block"}}>
                    <div style={letterStyle} className="xuanzhuan1">
                        <div style={{marginTop: "10px"}}>{this.props.name}</div>
                    </div>
                    <div></div>
                    <div style={letterStyle} className="xuanzhuan2">
                        <div style={{marginTop: "10px"}}>{this.props.name}</div>
                    </div>
                    <div></div>
                    <div style={letterStyle} className="xuanzhuan1">
                        <div style={{marginTop: "10px"}}>{this.props.name}</div>
                    </div>
                    <div></div>
                    <div style={letterStyle} className="xuanzhuan2">
                        <div style={{marginTop: "10px"}}>{this.props.name}</div>
                    </div>
                </div>
            </div>
        )
    }
}

$(function () {
    $('#bb').click(function () {
        $('#aoao').toggle();
    });
});

class Ball extends React.Component {
    render() {
        return (

            <div>
                <div style={{margin: "auto"}}>
                    <button className="anniu" id={"bb"}>点我</button>
                </div>

                <div id={"aoao"}>
                    {arr.map(function (item) {
                        return (
                            <div style={{display: "inline-block"}}>
                                <Header name={item.name} bg={item.color}/>
                                {/*<Aaa name={item.name} bg={item.color}/>*/}
                            </div>
                        )

                    })}
                    {/*<img className={"huojian"} src={require('../img/huojian.png')}/>*/}
                    {/*<img className={"huojian"} src={require('../img/huojian.png')}/>*/}
                    {/*<img className={"huojian"} src={require('../img/huojian.png')}/>*/}
                    {/*<img className={"huojian"} src={require('../img/huojian.png')}/>*/}
                    {/*<img className={"huojian"} src={require('../img/huojian.png')}/>*/}
                    {/*<img className={"huojian"} src={require('../img/huojian.png')}/>*/}
                    {/*<img className={"huojian"} src={require('../img/huojian.png')}/>*/}
                    {/*<img className={"huojian"} src={require('../img/huojian.png')}/>*/}
                    {/*<div className={"dong"}><p>插我</p></div>*/}
                </div>
            </div>
        );
    }
}

export default Ball;